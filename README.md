# Online Store [WorkInProgress]

## Tech Stack:
* Backend: Kotlin, spock
* SpringBoot, Spring-Cloud, Spring-Data, Spring-Security
* Docker, docker-compose (deploy from docker-compose to Kubernetes) 
* Grafana, prometheus
* Gatling
* Angular 7

## Requirements: 
* minikube, docker, docker-compose, kubectl, intelliJ-idea

### `./infrastructure`
* `/spring-cloud` - config-server, discovery-server, gateway, edge-service (reversed proxy), load-balancer...
* `/monitoring` - actuator -> prometheus, grafana...

### `./backend`
* `/products-listing` -
* `/shopping-card` -
* `/payment` - 
* `/shipping` - 
* `/invoice` - 

### `./frontend`
* angular 7

### `./performance-tests`
* gatling
