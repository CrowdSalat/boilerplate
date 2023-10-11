# test-playbook


## prerequisite

- `npm install -g serverless`

## serverless azure function creation and usage

```shell
# create azure function serverless framework project from template


mkdir azure-function-python
cd azure-function-python
serverless create --template azure-python
 # in serverless.yml unter plugins.resourceGroup die Ziel RG angeben, damit keine neue angelegt wird
 # in serverless.yml die subscriptionid angeben

serverless plugin install -n serverless-azure-functions
serverless plugin install -n serverless-offline
 
 # build functions for offline usage and start offline server
serverless offline

# deploy on azure
serverless deploy
```
