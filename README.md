Sellable
---------
- Interfaces
- Why we declared these two functions here

Vehicle
--------
- Abstract classes
- Abstract classes vs interfaces
- Comparable
- Ternary statements

Car
----
- Simple subclass for Vehicle abstract class
- Referencing super() constructor
- @Override annotation

SortingExample
----------------
- How to use built in sorting functions with collections
- Demonstrate simple usage of a Comparable in sorting

Truck
------
- Overriding superclass methods

Bicycle
--------
- Extending a class while implementing an interface
- Final object properties
- Primitive variable defaults (why set salePrice to -1)

MountainBike
-------------
- Extending a subclass
- Creating a more specialized constructor
- Final class

Depot
-----
- Iterable
- Declaring ArrayList, how lists work
- Wrapper around arraylist
- Built to be easily sortable
- Comparable vs Comparator

GenericCompare, GenericVehicleCompare, MaxSpeedCompare, SortingFunction
------------------------------------------------------------------------
- All used for SortingExample below
* Records*
* Generics*
* @FunctionalInterface annotation*

SortingExample2
--------------
- var usage
- How to use built in sorting functions with collections
- Iterating over custom iterable class (for var vehicle : depot)
- Sorting using custom comparators
- Anonymous classes*
- Lambda declaration*
- Method reference usage*

Product
--------
- Overloaded methods/constructors
- Overriding toString()
- Overriding equals() and hashCode()

SetExample
----------
- Declaring HashSets, how sets work
- Overriding equals() and hashCode()

MapExample, MapExample2
------------------------------------
- Declaring HashMaps, how maps work
- Various map methods: put(), entrySet(), keySet(), values(), containsKey(), getOrDefault()

Warehouse
----------
- Iterable
- Combining collections in one object
- Manipulating object properties within constructor
- Generating random numbers in java
- Using store() to protect access to our collections properties
- Using getProductId() to provide access to our private object data
- Pattern recognition with instanceof keyword (in store())

InstanceOfExample, InstanceOfExample2
-------------------------------------
- instanceof keyword and usage
- Using instanceof to deal with unknown object types
- Static keyword
- Classes as objects

MapExample3
------------
- Combining on-the-fly collections with collection-based objects like Warehouse
- Using maps to organize data
- Dealing with unknown object types
- TreeSet example

FailExamples
-------------
- Foreach can cause thread exceptions because it uses iterable under the hood
- Difference in philosophy when providing various collections classes: fail-fast vs fail-safe
- ConcurrentModificationException
