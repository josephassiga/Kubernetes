FROM ubuntu:latest

RUN apt-get update; apt-get -y install fortune

ADD fortuneLoop.sh /bin/fortuneLoop.sh

ENTRYPOINT /bin/fortuneLoop.sh
