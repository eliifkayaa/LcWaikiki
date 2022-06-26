@HomePage
  Feature: LcWaikiki Home Page

    @Banner
    Scenario: Check Home Page
      Given LcWaikiki is on Home Page
      Then should see Banner

      @NewRecord
      Then should see New Record
      Then should see E-posta
      Then should see Password
      Then should see Phone
      When click Sign Up

      @SelectProduct
      When click Category
      When click Category Color "Siyah"
      When click Product
      When click Product Size M

      @AddBasket
      When click Add To Basket
      When click Go To Basket
      Then check it Basket

      @Pay
      When click Pay
      Then check it Pay




