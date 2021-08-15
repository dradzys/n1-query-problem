# The N+1 query problem
The following repository is dedicated to understanding and avoiding the N+1 query problem. Commonly found in ORM's, native SQL and other data access technologies.
# Table of Contents
1. [Introduction](#introduction)
    1. [What is the N+1 query problem?](#what)
    2. [Is it a problem?](#problem)
2. [Setup](#setup)
    1. [Start application](#start)
    2. [Schema](#schema)
    3. [Configuration](#configuration)


# Introduction<a name="introduction"></a>
### What is the N+1 query problem? <a name="what"></a>
The N+1 query problem happens when the data access framework executed N additional SQL statements to fetch the same data that could have been retrieved when executing the primary SQL query.

The larger the value of N, the more queries will be executed, the larger the performance impact. And, unlike the `slow query log` that can help you find slow running queries, the N+1 issue won't be spot on because each individual additional query runs sufficiently fast not to trigger slow query log.

The problem is executing a large number of additional queries that, overall, take sufficient time to slow down response time.

### Is it a problem? <a name="problem"></a>

It mainly depends on the size of your application data set and whether slow performance is acceptable for your case. The problem arises executing a large number of additional queries that, overall, take sufficient time to slow down response time. The performance hit is significant for application with large data sets.

# Setup <a name="setup"></a>

### Start application <a name="start"></a>
    1. pull code
    2. ./mvnw package clean -DskipTests
    3. docker-compose up

### Schema definition <a name="schema"></a>
to be filled

### Configuration <a name="configuration"></a>
to be filled