## Observer Design Pattern

**Entrance File**: AnimalPlay.java

**Key Point**:

- Determines Subject and Observer, is one-to-many relationship
- For Subject, it should provide *addObserver*, *removeObserver*, *notifyObserver* methods, using an array to maintain all the observers
- For Observer, it should implement *update* method, which would be invoked when the subject notifying, and constructer should be passed a *Subject* as parameter
- Both Subject and Observer should be *interface*


![image](diagram.png)