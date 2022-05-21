# Christian's Solution To implement for ForEx

To get around the limitation with the one frame API, need to create a cache using Map that maps the currecny conversion to be done to the value and timestamp.
Thus before hitting the one frame API, check the cache first to limit the number of get requests with the singular token. 
Also, calculate the inverse and store in cache. (i.e. if user asks for USDJPY, the JPYUSD is the inverse of USDJPY and we can store that value in cahce on the same API call)

Things to also check:

- User enters invalid currencies (Dont hit api send error: Invalid currencies)
- User enters invalid input. (Error: Invalid Input)
- User enters currency we do not support (Error: Unsppoorted currency)

## How to start

1) Start the OneFrameAPI
    - Pull the docker image with:
        ```docker pull paidyinc/one-frame```
    - Run the service locally on port 8080 with docker ```run -p 8080:8080 paidyinc/one-frame```

2) Run the forex server
    - Cd to Forex-mtl and run ```sbt```
    - Then ```run``` (Note: should be using a different port than 8080)

3) Make calls to the API via postman