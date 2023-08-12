<p align="center"><img src="https://i.imgur.com/ayPwxrW.png" width="400"></p>


# Interpolation Search algorithm

## About the project:

Interpolation search is an alternative when certain particular situations arise and offers, on **average**, a **better execution time than binary search**, 
however, in the **worst case**, they offer a **significantly worse** execution time.

It is therefore important to detect **when it is really advantageous to apply** this method:

- **When accessing the element sought is very costly**: For example, accessing an element stored in memory is very fast, but if the element is on a **disk** access is much more costly in terms of **time** and resources.
- When the elements are ordered according to a uniform distribution.

This method is based on analyzing the problem in order to **make an estimate that allows**, from the beginning, **determine where the element** to be found is located. 

A value corresponding to the valuation of a much more complex **formula** is taken as a reference. While the calculation of this value makes the process more complex and **slows down each iteration**, in many cases, it is **insignificant compared to the cost of having to access** an element.

- In the **worst case**, when the elements of the structure do not respond to a uniform distribution, this method can have a **linear O(n)** execution time.
- But, if you have a structure with a uniform or at least a fairly uniform distribution, you can get an **average** of ***O(n*Log(Log(n)))***
- In the **best case**, the initial estimate is the element sought ***O(1)***.

## About me:

You can come around to my [Linkedin](https://www.linkedin.com/in/arenadaiana/) to say hi	:grin:  ♥

## Contributions:
Contributions to this project are welcome! If you'd like to add new algorithms, enhance existing code, or improve documentation, please follow the standard GitHub workflow:

1. Fork the repository.
2. Create a new branch for your contribution.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Create a pull request describing your changes.

Thank you for visiting my Java Algorithms and Data Structures project! Your feedback and suggestions are greatly appreciated.




