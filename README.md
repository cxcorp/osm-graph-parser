# osm-graph-parser
![travis](https://travis-ci.org/rovaniemi/osm-graph-parser.svg?branch=master)
[![Code Coverage](https://img.shields.io/codecov/c/github/rovaniemi/osm-graph-parser/master.svg)](https://codecov.io/github/rovaniemi/osm-graph-parser)
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](https://github.com/rovaniemi/osm-graph-parser/blob/master/LICENSE)

Java program that parses OSM XML files into a json graph representation. 

## Example

In output file you will have nodes and edges (highways in real world) with weight (unit: `centimetres`).
```json
[
  {
    "la": 60.1570875,
    "lo": 24.9563234,
    "e": [
      {
        "i": 1,
        "w": 514
      },
      {
        "i": 17,
        "w": 574
      }
    ]
  },
  {
    "la": 60.1570488,
    "lo": 24.9562727,
    "e": [
      {
        "i": 0,
        "w": 514
      },
      {
        "i": 2,
        "w": 784
      },
      {
        "i": 11302,
        "w": 413
      }
    ]
  }
 ]
 ```
 
 ### How to read that json
 ```
 la = latitude
 lo = longitude
 e = edges
 i = main array index, if the i is 0 it refers to the first element in the array
 w = weight
 ```
## Getting Started

1. [Download](https://github.com/rovaniemi/osm-graph-parser/releases) latest version under the releases tab.
2. [Download](https://www.openstreetmap.org/) openstreetmap data. (click export, select area, and then export)
3. Make directory called `map` in the directory where you have downloaded .jar file.
4. Name osm file to map-01.osm, if you have multiple osm files name them like `map-01.map`, `map-02.map` etc. and put them in map directory.
5. Now your tree should look like this. ![img](http://imgur.com/ntvFUQN.png)
6. Run the jar file. (terminal `java -jar <jar-file-name>.jar`)
7. Now you have `graph.json` in the same directory where the .jar file is.
8. If you use this data in your own service read [openstreetmap licence.](https://opendatacommons.org/licenses/odbl/1.0/)

### Possible errors

1. Parsing take much time or program crash.
    - You need more memory for the program. Change java run command to `java -jar -Xmx4096m <jar-file-name>.jar`. That will increase java heap max size to 4gb. You will need 4gb ram for that. If you parse huge map you will need bigger heap size.

### Prerequisites

You will need a Java Runtime Environment (JRE) to run java programs. You can download it [here](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html).

## Built With

* [Gradle](https://gradle.org) - Dependency Management

## Authors

* **Mauri Karlin** - *Owner* - [Rovaniemi](https://github.com/Rovaniemi)
* **Joona Heikkilä** - Optimizations and refactorings - [cxcorp](https://github.com/cxcorp)

## License

This project is licensed under the GNU GENERAL PUBLIC LICENSE - see the [LICENSE](LICENSE) file for details