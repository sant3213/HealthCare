FROM node:12.3.1 AS compile-image

MAINTAINER Santiago
LABEL authors="Santiago Cárdenas "

ENV HOME=/usr/src/app
RUN mkdir $HOME
WORKDIR $HOME

# Instalamos angular cli en nuestra imágen
RUN npm install -g @angular/cli@9.1.9 && npm cache clean

# Puerto entorno dev
EXPOSE 4200