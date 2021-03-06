# mAdapt Data Microservice

[![Build Status](https://travis-ci.org/RHoKAustralia/madapt-data-service.svg?branch=master)](https://travis-ci.org/RHoKAustralia/madapt-data-service)

## About

### mAdapt

[mAdapt](http://www.madapt.org/) will use mobile technology to provide refugees with information concerning their most pressing reproductive health needs.

mAdapt will also collect anonymous data that can help inform service delivery and policy development by mapping what services are being sought, in what region, and how often.

### This repo

This repository is for a RESTful data microservice. This service queries the database being fed into by Segment integration in [the front end](https://github.com/RHoKAustralia/madapt-react-frontend) and returns JSON data for use in visualisation and data export.

## Contributing

## Deployment

Continuous integration and deployment are provided through [Travis CI](https://travis-ci.org/). This happens automatically through the [.travis.yml](.travis.yml) file. 

This has anonymised Amazon Web Services credentials -- do not change these.

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2017 mAdapt
