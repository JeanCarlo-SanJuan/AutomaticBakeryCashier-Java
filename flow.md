1. Navigation (Main menu)
    1. Browse shop
    1. View cart
    1. Login / Manage account
    1. Exit
    
1. Shop Inventory
    1. Buttons:
        1. Show list of categories
            1. Show list of items in categories
                1. Ask quantity
                    1. Add item to cart
        1. Return

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

1. Account System
    <!-- By default treats user as a guest -->
    1. Displays:
        1. Balance::float
        1. Allowed discounts - Student | Senior | PWD
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
            fields:
            1. ask name
            1. year of birth
            Todos:
            1. save credentials to file.