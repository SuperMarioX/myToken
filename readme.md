### cmd to generate a rsa_2048 keys
```
openssl
genrsa -out rsa_private_key.pem 2048
pkcs8 -topk8 -inform PEM -in rsa_private_key.pem -outform PEM –nocrypt
rsa -in rsa_private_key.pem -pubout -out rsa_public_key.pem
```

### url to remind
[Java中使用OpenSSL生成的RSA公私钥进行数据加解密](http://blog.csdn.net/chaijunkun/article/details/7275632/)
[java使用rsa加密解密签名及校验](http://blog.csdn.net/wangqiuyun/article/details/42143957/)

### 关于秘钥以及数字签名的解释
[ 数字签名与数字证书](http://blog.csdn.net/oscar999/article/details/9364101)
