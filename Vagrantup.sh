#!/bin/bash

# set package version.
DOCKER_CE_VERSION=17.09.0~ce-0~ubuntu
DOCKER_COMPOSE_VERSION=1.17.0
DOCKER_MACHINE_VERSION=V0.13.0

# update package definition.
sudo apt update

# install package dependencies.
sudo apt install -y \
  apt-transport-https \
  ca-certificates \
  curl \
  software-properties-common

# add docker official gpg key.
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

# add docker repository.
sudo add-apt-repository \
  "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

# install docker engine binary.
sudo apt update
sudo apt install -y docker-ce=$DOCKER_CE_VERSION

# install docker compose binary.
sudo apt update
sudo curl --silent --location \
  https://github.com/docker/compose/releases/download/$DOCKER_COMPOSE_VERSION/docker-compose-`uname -s`-`uname -m` > \
  /tmp/docker-compose
sudo chmod +x /tmp/docker-compose
sudo cp /tmp/docker-compose /usr/local/bin/docker-compose

# install docker machine binary.
sudo apt update
sudo curl --silent --location \
  https://github.com/docker/machine/releases/download/$DOCKER_MACHINE_VERSION/docker-machine-`uname -s`-`uname -m` > \
  /tmp/docker-machine
sudo chmod +x /tmp/docker-machine
sudo cp /tmp/docker-machine /usr/local/bin/docker-machine

# attach docker group.
sudo usermod -aG docker ubuntu
sudo shutdown -r 0
