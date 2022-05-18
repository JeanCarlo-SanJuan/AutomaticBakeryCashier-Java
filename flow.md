1. Navigation (Main menu)
    1. Browse shop
    1. View cart
    1. Login / Manage account
    1. Exit
    
1. Shop Inventory
    1. Buttons:
        1. Show list of categories
            1. butons for each item in category
                1. onClick
                    1. cart.addItem(category_id, item_id)
        1. Return

1. Item (subclass)
    1. init:
        1. promptQuantity
    1. Props:
        1. Name
        1. Price::float
        1. Quantity::int
    1. Public methods:
        1. getTotal
        1. getName
        1. getPrice
        1. getQuantity
        1. promptQuantity

1. Cart (User Inventory)
    1. Props:
        1. Items::list
    1. Displays:
        1. total (without discount)
        1. Item subtotal
    1. Buttons:
        1. Adjust quantity
        1. Delete item
        1. Checkout
        1. Return
    1. Public methods:
        1. addItem (category_id,item_id)
        1. removeItem
        1. changeQuantity

1. Account System
    <!-- By default treats user as a guest -->
    1. Displays:
        1. Balance::float
        1. Status - Student | Senior | PWD | Premium
    1. Buttons:
        1. Deposit amount
        1. Return
    1. Public methods:
        1. login
        1. logout
        1. verify
        1. deposit
        1. getBalance
        1. register
            1. props:
                1. ask name
                1. year of birth
            1. Todos:
                1. save credentials to file.