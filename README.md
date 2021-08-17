# The N+1 query problem

The following repository is dedicated to understanding and avoiding the N+1 query problem. Commonly
found in ORM's, native SQL and other data access technologies.

# Table of Contents

1. [Introduction](#introduction)
    1. [What is the N+1 query problem?](#what)
    2. [Is it a problem?](#problem)
2. [Setup](#setup)
    1. [Start application](#start)
    2. [Schema](#schema)
    3. [Configuration](#configuration)
3. [Examples](#examples)
    1. [Native SQL](#native)
    2. [JPA/Hibernate](#jpa)
4. [API](#api)

# Introduction<a name="introduction"></a>

### What is the N+1 query problem? <a name="what"></a>

The N+1 query problem happens when the data access framework executed N additional SQL statements to
fetch the same data that could have been retrieved when executing the primary SQL query. The larger
the value of N, the more queries will be executed, the larger the performance impact.

### Is it a problem? <a name="problem"></a>

It mainly depends on the size of your application data set and whether slow performance is
acceptable for your case. The problem arises executing a large number of additional queries that,
overall, take sufficient time to slow down response time. The performance hit is significant for
application with large data sets.

# Setup <a name="setup"></a>

### Start application <a name="start"></a>

1. Pull code
2. Build a jar
    1. Unix `./mvnw clean package`
    2. Windows  `mvnw.cmd clean package`
3. `docker-compose up`

### Schema definition <a name="schema"></a>

to be filled

### Configuration <a name="configuration"></a>

to be filled

# Examples <a name="examples"></a>

### Native SQL <a name="native"></a>

N+1 query

```SQL
SELECT c.uuid, c.comment, c.post_uuid
FROM COMMENT c; -- the +1 side
```

```SQL
SELECT p.uuid, p.title
FROM POST p
WHERE p.uuid = :uuid; -- the N side
```

Single query

```SQL
SELECT c.*, p.*
FROM COMMENT c
         LEFT JOIN POST p ON c.post_uuid = p.uuid;
```

### JPA and Hibernate <a name="jpa"></a>

to be filled

### API <a name="api"></a>

Just some simple get end-points, to demonstrate N+1 problem. Since we have spring configured to
display each query executed, it will be easy to notice which, queries have the N+1 problem and which
don't.

Swagger will be generated at project root: `/swagger-ui.html`
