from litellm import completion
import speech_recognition as sr


def listen(language="de-DE"):
    r = sr.Recognizer()
    with sr.Microphone() as source:
        # Debug: print available Microphones
        print("Available Microphones:", sr.Microphone.list_microphone_names())
        print("Listening...")
        r.adjust_for_ambient_noise(source)
        audio = r.listen(source)
    try:
        print("Recognize text")
        text = r.recognize_google(audio, language)
        print(text)
    except sr.UnknownValueError:
        print("Google Speech Recognition could not understand audio")
    except sr.RequestError as e:
        print(
            "Could not request results from Google Speech Recognition service; {0}".format(e))


def call_model(text):
    response = completion(
        model="ollama/gemma:2b",
        messages=[
            {"content": "respond in 20 words. who are you?", "role": "user"}],
        api_base="http://localhost:11434"
    )

    print(response)


if __name__ == "__main__":
    content = listen()
    print(content)
