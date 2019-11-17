# Flow Riddles
[![CircleCI](https://circleci.com/gh/rozkminiacz/FlowRiddles/tree/master.svg?style=svg)](https://circleci.com/gh/rozkminiacz/FlowRiddles/tree/master)

Repository for learning Kotlin Flow API, inspired by [RxRiddles](https://github.com/vanniktech/RxRiddles)

Each riddle is a class with an unit test that will verify your solution.
There are multiple ways to create function that will make test pass, nevertheless riddles are constructed to be solved with single operator or extension.

## Contribution
All contributions are welcome!

If you want to add new riddle to repository, please follow this guidelines:

### Riddle creation
Come up with simple riddle that will test ones knowledge of Kotlin Flow API.
Make riddle small and concise - e.x test knowledge of applying one specific operator or some kind of flow creation mechanism.
Write one or more unit test for that riddle. Please follow patterns used in existing riddle unit tests.

### Submitting new FlowRiddle to repository:
- create `object` Riddle0 in package `tech.michalik.flowriddles` with `solve` method - with `kotlin.TODO()` method
- create `object` Riddle0Solution in package `tech.michalik.flowriddles.solutions` with actual implementation
- create test in file Riddle0Test in `tech.michalik.flowriddles`

Submit PR with this changes. After review, Riddle will have proper order number assigned to it.