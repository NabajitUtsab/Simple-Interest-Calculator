# 💰 Simple Interest Calculator (Java)

A simple **Java console application** that calculates the interest based on user inputs — principal, interest rate, and time duration (in years or months).

---

## 🧠 Overview

This project demonstrates:
- Taking user input using the `Scanner` class  
- Parsing and processing string data  
- Basic conditional logic  
- Simple arithmetic for calculating interest  

---

## ⚙️ Features

✅ Accepts:
- **Principal amount**  
- **Interest rate** (as a percentage)  
- **Duration** (e.g. `5y` for 5 years or `24m` for 24 months)

✅ Automatically converts months to years  
✅ Displays the calculated **simple interest** in taka  

---

## 🧩 Formula Used

\[
\text{Simple Interest} = \frac{(Principal × Rate × Time)}{100}
\]

- **Principal** → Amount borrowed or invested  
- **Rate** → Annual interest rate (%)  
- **Time** → Duration in years  

If input is in months (e.g. `24m`), it is converted to years using:

Time (years) = {months}/{12}


---

## 💻 Example Run
Please enter the principle : 10000

Please enter the interest rate : 10

Please enter the year : 24m

Your interest is : 833.3333333333334 taka


---

## 🏗️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/simple-interest-calculator.git

2. Navigate to the project folder:

   cd simple-interest-calculator

3. Compile the Java file:

  javac Main.java


4. Run the program:

  java Main
