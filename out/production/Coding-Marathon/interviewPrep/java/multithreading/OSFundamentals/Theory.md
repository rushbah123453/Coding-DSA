**concurrency**
It is used to increase: 

1. Responsiveness : concurrency
2. Performance : Parallelism

Multitasking creates an illusion as if one or more task are worked on in parallel but in 
reality only task is worked upon on.

We dont need multiple cores for concurrency, even with one core it works

With multicore, we can run parallel tasks simultaneously

It is used for high scale application:
 1. Reduces time and machine

What exactly happens when you open an application on your Desktop?
- The Application is initially loaded on hard-disk and whenwe click on application 
it gets loaded on th memory as an instance. This insstance consists of 

1. PID
2. Context
3. Files to read/write
4. Heap (Data)
5. Code (logic)
6. N Thread

**A Thread consists of**

1. Stack : local variable are stored
2. Instruction pointer : Address of next instruction to execute
