What Happens when user opens a text editor(notepad) and music player after that?
- A Text Editor thread will run and then music player Thread will run

How are these 2 threads schedule? who will run first?
- There is a group of epochs , in each epoch all threads will run certain amount of time 
and so on and this is called as Dynamic priority for which thread will run for
how much time in an epoch

Dynamic Priority = Static Priority + Bonus

Static Priority: This is set by developer Programatically
Bonus: Adjusted by OS in every epoch for each thread.



