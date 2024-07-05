


## 测试

```sh

#热编译运行
gowatch



docker ps

docker images |grep for-java-k8sapi

docker ps |grep openjdk

docker run -it cf-workers-docker-io-bv6.pages.dev/openjdk:8-jdk-alpine  sh -c "ls /lib"


# 打包编译
make package

# 制作docker镜像
make onlyimg

# 测试用
#docker run -it for-java-k8sapi:0.1 sh -c "pwd"
docker run -it for-java-k8sapi:0.1 sh -c "ls"
docker run -it for-java-k8sapi:0.1 sh -c "java -jar app.jar"


# 
kubectl delete -f app1.yaml
kubectl apply -f app1.yaml
kubectl get po
kubectl get po -oyaml > tmp/1.yaml

kubectl get po |grep Running|awk '{print $1}'|xargs -I {} kubectl logs {}


```


