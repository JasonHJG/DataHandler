============================================================================================================================================================================================================================================================================                Qn1: Hello world              ==============================================================================================
============================================================================================================================================================================================================
*What file*:
There is a single class hello_world in the dirctory upperDir:
—upperDir
  -helloWorld.java


*How to run*:
Go into directory upper_level (cd upperDir) and use:
javac hello_world.java                
//you will see helloWorld.class after this
java hello_world.                     
//you will see:Jingang (Jason) He, Financial Mathematics, Courant Institute



============================================================================================================================================================================================================================================================================               Qn2: DataHandler                 ============================================================================================
============================================================================================================================================================================================================
*What files*:
There are two .java files: DataHandler.java and quickSort.java contained in directory datahandler

*Parameters*:
There is a global integer constant in the DataHandler class called verbose, whose default value is 0. To see which dates are used in the computation process, set it to 1 in the main function and the dates will be printed out.(Yes, you need to change DataHandler.java in order to do it). In the results I show below, I use both verbose=0(if you want to see a simple answer) and verbose=1 (if you want to see details).

The precision is set to 3 decimal point in the short answer (with verbose==0). You can see a double version for more details(with verbose==1) 

*How to run*:
To run this program in your computer. You need to pass two arguments into the main function:
the first arg is the absolute path of your prices.csv
the second arg is the absolute path of your corrections.csv

To run it in the shell. Lets assume you have a directory structure as such and assume you are in UpperDir:
--UpperDir
  --datahandler
    -DataHandler.java
    -quickSort.java
    
then use the following command:
mkdir classes
javac -d classes datahandler/quickSort.java
javac -d classpath classes datahandler/DataHandler.java
java datahandler.DataHandler "absolute path of prices.csv" "absolute path of corrections.csv"

    
To run it with IDE (i.e. Eclipse), choose run configuration and then click on arguments, and put the absolute path of prices.csv as the first arg and the absolute path of corrections.csv as the second arg. Then run and you will see the answer.

*Results*:
Verbose==0
Part 4):
The Prices of SPY between 08/15/2004 and 08/20/2004 are:
94.420 
94.950 
95.920 
95.640 
96.320 

Part 5):
The average prices is:
97.094 

Part 6):
The maximum price is:
99.770 

Part 7):
The moving averages are:
96.040 
96.234 
96.426 
96.539 
96.790 
96.933 
97.165 
97.360 
97.480 
97.651 
97.824 
98.097 
98.244 



Verbose==1
all the prices are arranged according to:
Open High Low Close Volume AdjClose

All numbers are recorded in double precision;
Volume is represented by scientific format instead of its original format;

part 4):

The dates recorded from 08/15/2004 to 08/20/2004 are:
8/16/2004
8/17/2004
8/18/2004
8/19/2004
8/20/2004

The Prices of SPY between 08/15/2004 and 08/20/2004 are:
107.14 108.64 107.1 108.3 4.57319E7 94.42 
108.75 109.28 108.53 108.91 4.07016E7 94.95 
108.52 110.17 108.49 110.03 4.31654E7 95.92 
109.81 110.02 109.18 109.71 3.98816E7 95.64 
109.61 110.63 109.51 110.48 4.48709E7 96.32 

Therefore we have:
8/16/2004:
107.14 108.64 107.1 108.3 4.57319E7 94.42 

8/17/2004:
108.75 109.28 108.53 108.91 4.07016E7 94.95 

8/18/2004:
108.52 110.17 108.49 110.03 4.31654E7 95.92 

8/19/2004:
109.81 110.02 109.18 109.71 3.98816E7 95.64 

8/20/2004:
109.61 110.63 109.51 110.48 4.48709E7 96.32


part 5):
The average prices are:
111.09409090909094 111.69272727272727 110.74590909090908 111.37090909090908 3.676090454545455E7 97.09409090909092

The dates recorded from 8/15/2004 to 9/15/2004 are:
8/16/2004
8/17/2004
8/18/2004
8/19/2004
8/20/2004
8/23/2004
8/24/2004
8/25/2004
8/26/2004
8/27/2004
8/30/2004
8/31/2004
9/1/2004
9/2/2004
9/3/2004
9/7/2004
9/8/2004
9/9/2004
9/10/2004
9/13/2004
9/14/2004
9/15/2004



part 6):
The maximum price for them are:
114.51 115.12 114.17 114.86 9.08305E7 99.77

The dates recorded from 4/15/2004 to 6/15/2004 are:
4/15/2004
4/16/2004
4/19/2004
4/20/2004
4/21/2004
4/22/2004
4/23/2004
4/26/2004
4/27/2004
4/28/2004
4/29/2004
4/30/2004
5/3/2004
5/4/2004
5/5/2004
5/6/2004
5/7/2004
5/10/2004
5/11/2004
5/12/2004
5/13/2004
5/14/2004
5/17/2004
5/18/2004
5/19/2004
5/20/2004
5/21/2004
5/24/2004
5/25/2004
5/26/2004
5/27/2004
5/28/2004
6/1/2004
6/2/2004
6/3/2004
6/4/2004
6/7/2004
6/8/2004
6/9/2004
6/10/2004
6/14/2004
6/15/2004

part 7):
The dates recorded from 8/15/2004 to 9/15/2004 are:
8/16/2004
8/17/2004
8/18/2004
8/19/2004
8/20/2004
8/23/2004
8/24/2004
8/25/2004
8/26/2004
8/27/2004
8/30/2004
8/31/2004
9/1/2004
9/2/2004
9/3/2004
9/7/2004
9/8/2004
9/9/2004
9/10/2004
9/13/2004
9/14/2004
9/15/2004

The moving averages are:
109.751 110.44499999999998 109.451 110.16300000000001 3.686334E7 96.03999999999999 
110.15900000000002 110.715 109.78599999999999 110.38600000000001 3.49628E7 96.23400000000001 
110.35000000000002 110.90299999999999 109.94300000000001 110.606 3.530517E7 96.426 
110.593 111.05 110.14200000000001 110.73500000000001 3.626646E7 96.53899999999999 
110.73600000000002 111.31800000000001 110.348 111.022 3.655196E7 96.78999999999999 
111.008 111.537 110.598 111.186 3.511292E7 96.93299999999999 
111.20700000000002 111.773 110.825 111.452 3.547229E7 97.16499999999999 
111.40500000000002 112.006 111.071 111.675 3.572329E7 97.35999999999999 
111.62899999999999 112.167 111.28399999999999 111.81300000000002 3.529963E7 97.47999999999999 
111.785 112.36300000000001 111.407 112.00900000000001 3.542674E7 97.651 
111.99599999999998 112.57399999999998 111.60300000000002 112.20700000000002 3.737626E7 97.82399999999998 
112.204 112.809 111.877 112.52000000000002 3.75085E7 98.09700000000001 
112.46799999999999 113.02899999999997 112.13500000000002 112.68900000000001 3.692547E7 98.244 


