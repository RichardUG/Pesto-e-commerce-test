#!/bin/bash

# Creating images
docker build -t auth-service-image:1.0 ./ecommerce-auth-service
docker build -t product-management-service-image:1.0 ./ecommerce-product-management-service
docker build -t order-processing-service-image:1.0 ./ecommerce-order-processing-service

# Leave the current swarm (if part of one)
docker swarm leave --force > /dev/null

# Inicializar el swarm con el manager
docker swarm init > /dev/null

# Desplegar el stack de Docker Compose en el swarm
docker stack deploy -c docker-compose.yml pestoecommerce