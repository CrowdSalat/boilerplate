# Call ollama from python


## install and start ollama

```shell
# install
# brew install ollama

# in one terminal
ollama serve

# test model
ollama run gemma:2b
```

## prerequisite for mac

```shell
brew install ollama
# so pyaudio works
brew install portaudio
```

## setup workspace

[Setup python env](https://cloud.google.com/python/docs/setup)

```shell
python -m venv env
## start venv
source env/bin/activate
##  install requirements
pip install -r requirements.txt
## create new requirements.txt
# pip freeze

##stop
deactivate
```