Turkish Identity Validator
=========
Verifying the identity number information of Turkish citizens

Usage
-----
```
Validator validator = new Validator();
validator.checkIdentityNumber("XXXXXXXXXXX");
```

Algorithm
----------
There are 6 steps required to verify the TC number of a Turkish citizen

```
                                  TC -> ABCDEFGHIJK

R1)Must be 11 digits.
R2)The first digit must be other than 0.   A = (0-9)
R3.1) 10th digit = ( 7x(A+C+E+G+I)  - (B+D+F+H) ) (mod10)
R3.2) 10th digit = ( 7x(A+C+E+G+I)  +  9x(B+D+F+H) ) (mod10)
R4.1) 11th digit = ( A+B+C+D+E+F+G+H+I+J ) (mod10) 
R4.2) 11th digit = ( 8x(A+C+E+G+I) ) (mod10) 

```


References
----------
> wikipedia.org

> onedio.com
