## Launching and Connecting to an EC2 Instance

```text
1. Open an SSH client.
2. Locate your private key file. The key used to launch this instance is aws-ramanuj-key.pem
3. Run this command, if necessary, to ensure your key is not publicly viewable.
 chmod 400 aws-ramanuj-key.pem
4. Connect to your instance using its Public DNS:
 ec2-52-20-107-155.compute-1.amazonaws.com
Example:
 ssh -i "aws-ramanuj-key.pem" ec2-user@ec2-52-20-107-155.compute-1.amazonaws.com

```

## Installing Docker

```text


1. sudo yum update -y
2. sudo yum install docker -y
3. sudo service docker start
4. sudo su
5. docker  -v



```

## Basic Docker Commands

https://github.com/ram1ujdx/docker-exercise

## Running the covid-info app

```text

1. Pull the image
docker pull ram1uj/covid-info

2. Run the image

docker run -p 8080:80 -d ram1uj/covid-info


```

## Browsing the running application

* http://[ip-address]:8080

## Running Spring Boot App with Mysql

### Steps -

* Create a docker network
* Run Mysql on that network
* Update the application.properties accordingly
* Run Spring Boot App on that network

```bash


docker network create foodie-app-network

docker run -p 3306:3306 --network=foodie-app-network -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=cg_db -d --name mysql mysql

docker run -p 8500:8500 --network=foodie-app-network -e MYSQL_HOST=mysql -e MYSQL_PORT=3306 -e MYSQL_DATABASE=cg_db -e MYSQL_USER=root -e MYSQL_PASSWORD=password -d --name foodie-app foodie-app

```
