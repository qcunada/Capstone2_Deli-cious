# Capstone2_Deli-cious

# 🥪 DELI-cious Sandwich Shop - Java POS System

Welcome to the **DELI-cious Sandwich Shop**! This is a Java-based Point-of-Sale (POS) application designed for custom sandwich creation and order management. Perfect for simulating a real deli environment, this console app supports sandwich building, drinks, chips, checkout with tip, and receipt generation.

---

## 📋 Features

- ✅ Create customized sandwiches with:
    - Bread choices: `White`, `Wheat`, `Rye`, `Wrap`
    - Sizes: `4"`, `8"`, `12"` with dynamic pricing
    - Sauces: `Mayo`, `Mustard`, `Ketchup`, `Ranch`, `Thousand Islands`, `Vinaigrette`
    - Toppings:
        - Premium: `Meat` (e.g., Steak, Chicken) and `Cheese` (e.g., Cheddar, Swiss)
        - Regular: `Lettuce`, `Tomato`, `Onion`, etc.
        - Extra topping support

- 🥤 Add drinks (e.g., Cola, Tea, Coffee) with size-based pricing
- 🍟 Add chips with fixed options and pricing
- 🧾 Checkout with total price, receipt details, and tip input
- ⏰ Displays time of order in 12-hour AM/PM format
- ❌ Input validation for user-friendly experience

---

## 🧑‍💻 How It Works

### 1. Start Screen

    🥪Welcome to the * Bread & Butter * Sandwich Shop! 🥪

      -How can we help you today?-

        [1] Create new Order

        [0] Exit

    Choose an option: 



User can:
- Create a new order
- Exit the application

---

### 2. Order Menu

            ======= ORDER MENU =======

        What can I get you for your order?
            [1] 🥪 Choose my own Sandwich
            [2] ⚙️ Build my own Sandwich
            [3] 🎲 Random Sandwich  
            [4] 🥤 Add Drink  
            [5] 🥔 Add Chips
            [6] 🧾 Checkout
            [0] 🚀 Exit
            Choose an option: 

User can:
- choose from different options to order their sandwich
- build their own sandwich from the bread to the toppings
- choose a random sandwich button when they're in a hurry or feeling indecisive
- add chips and drinks to their order
- a checkout button to see all their items ready to be checked out


---


### 3. Choose Your Order

            == Choose your Sandwich! ===

    [1] The Classic 🧀 | $8.50   
        8" white, ham, cheddar, lettuce, tomato, mayo

    [2] The Veggie Wrap 🥬 | $10.75   
        12" wrap, provolone, pickles, jalapenos, vinaigrette

    [3] The Meat Lover 🥩 | $22.75  
        12" rye, steak, ham, roast beef, cheddar, bacon, mustard


User can:

- choose their sandwich from the favorites menu
- have 3 selections: The Classic, The Veggie Wrap and the Meat Lover



---

### 4. Build your own Sandwich

    What type of bread do you want for your sandwich? 🍞
    Choices include : White | Wheat | Rye | Wrap
    Bread choice:

    What size of sandwich would you like? 📏
    Choices include: 4" $5.50 | 8" $7.00 | 12" $8.50
    Size choice [4,8 or 12]:

    Choose a sauce for your sandwich 🥫
    Choices include: Mayo | Mustard | Ketchup | Ranch | Thousand Islands | Vinaigrette
    Sauce choice:

    Choose a topping type: Meat 🥩 | Cheese 🧀 | Regular 🥬 
    Type 'done' when your finish adding topping to your sandwich.


Interactive prompts allow customers to:
- Choose sandwich components
- Add multiple items (sandwiches, drinks, chips)


---
### 5. Randomized Sandwich

    Your random sandwich have been added!

    12" wheat sandwich
    Toppings:
    -steak
    Sauce: mustard
    Sandwich cost:     $11.50

User can:

- order a randomized sandwich that can include any topping and sauces
- good for when in a hurry, feeling adventurous or indecisive.


---

### 6. Add Drink

    What Drink would you like?

    Classic Cola 🥤
        A refreshing carbonated soft drink served chilled.

    Iced Lemon Tea 🍋
        Black tea with a splash of lemon over ice—light and zesty.

    Bottled Water 💧
        Pure, crisp bottled water to keep it simple and hydrating.

    Sparkling Berry Fizz 🍓
        Fruity sparkling water with a mix of strawberry and raspberry flavors.

    Fresh Orange Juice 🍊
        100% squeezed orange juice—no added sugar, just sunshine.

    Cold Brew Coffee 🧋
        Smooth and bold cold brew made from freshly ground beans, served over ice.

    Drink Choices: Cola | Tea | Water | Fizz | Orange | Coffee
        Small 2.00 | Medium 2.50 | Large 3.00

    Enter Drink 🥤:

User can:
- order different variety of drink of their choice
- choose from a descriptive menu to give them an idea what drink they are feeling today.
- choose from a small medium large sizes 

---

### 7. Add Chips

    Classic Sea Salt Chips 🧂
        Crispy kettle-cooked chips with a pinch of sea salt.

    Barbecue Crunch Chips 🍖
        Smoky, sweet, and tangy BBQ flavor with a bold crunch.

    Sour Cream & Onion Chips 🧅
        Creamy, tangy, and irresistibly savory.

    Spicy Jalapeño Chips 🌶️
        Zesty and hot with a satisfying heat kick.

    Classic | BBQ | Onion | Jalapeno
    Price: 1.50
    Enter chip name of choice 🥔:

User can:
- chose from a variety of selection of chips that will taste good next to your sandwich order.
- descriptive menu

---
### 3. Checkout
            --------Order Details--------

    8" white sandwich
    Toppings:
    -cheddar
    -lettuce
    -tomato
    Sauce: mayo
    Sandwich cost:     $8.50

    12" white sandwich
    (toasted)Toppings:
    Sauce: mayo
    Sandwich cost:     $8.50

    12" wheat sandwich
    Toppings:
    -steak
    Sauce: mustard
    Sandwich cost:     $11.50
    Drink: fizz        $2.00
    Chips: bbq         $1.50

    Subtotal: $32.00
    Enter tip amount:




- View running cart summary
- View receipt with detailed items
- Enter optional tip amount
- See final total with tip
- Order time shown in standard 12-hour format

---



