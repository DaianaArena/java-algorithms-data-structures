<p align="center"><img src="https://i.imgur.com/ayPwxrW.png" width="400"></p>


# Binary Search algorithm

## About the project:

This algorithm **starts from a structure that is ordered**. It is a **much more efficient** algorithm, because it **subdivides the structure in halves until the searched element is found** or it is evident that such element is not found.

The algorithm procedure consists of the following steps:

1. **The process starts at the central element** of the structure (in case the number of elements is odd) or almost central (in case the number of elements is even). In other words, the structure is divided into two halves;
- It is verified if the searched element corresponds to the central element**, in which case, the process ends. **If not**, **check if the searched element is greater or smaller**. If the element sought is **major, the first half** *(smaller numbers)* is discarded. If it is **minor, the second half** *(larger numbers)* is discarded.
- With the remaining half, start the process again**, from the first step.

This mechanism is repeated successively until the searched element is found or until the structure cannot be further subdivided, in which case it is concluded that the element is not found.

Programmatically, this algorithm is solved, initially, by having **references to the ends** and the **center** of the structure ***(MIN, MED, MAX)***.

- In the **best case**, when starting the process, the element in the central position corresponds to the searched element. ***O(1)***
- In the **worst case**, there are two situations:
    - **Success**: **Finding the searched element in the last iteration**. A number of iterations equal to ***Log(n)*** will therefore be made.
    - **Unsuccessful**: **Perform all iterations and detect no match** with the searched element. A number of iterations equal to ***Log(n)+1*** will therefore be made. The **last iteration** will correspond to a **null range**, i.e. it will not contain any element.
- On **average**, the searched element will be obtained with **one iteration less than the worst case**.

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




