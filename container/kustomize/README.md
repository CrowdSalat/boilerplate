# Kustomize

## commands



```shell
# OR use
# oc kustomize

# render base
kubectl kustomize base

# render dev
kubectl kustomize overlays/dev

# render prod
kubectl kustomize overlays/prod

# apply base

kubectl apply --kustomize base
```


## scafffold

```shell
mkdir -p base
touch base/kustomization.yaml
kubectl create deployment example --image nginx --dry-run=client -o yaml > base/deployment.yaml

mkdir -p overlays/dev
touch overlays/dev/kustomization.yaml

mkdir -p overlays/prod
touch overlays/prod/kustomization.yaml
```


## identifi

Overlays are identified with `apiVersion`, `kind` and `metadata.name`. 
