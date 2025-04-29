package behavioural

import "fmt"


type PaymentStrategy interface{
	Pay(amount float64)
}

type ApplePay struct{

}

func(a ApplePay) Pay(amount float64){
	fmt.Println("Payment made with apple pay")
}

type CardPay struct{}

func(c CardPay)Pay(amount float64){
	fmt.Println("Payment mad with card pay")
}

type Checkout struct{
	PayStrategy PaymentStrategy
}

func(checkout Checkout) ProcessPayment(amount float64){
	checkout.PayStrategy.Pay(amount)
}




/*
Allows us the flexibility to switch between different methods for accomplishing a task at run time
same outcome different strategies 
choosing a strategy can depend on users needs, like a user that has apple pay or user that has a card same outcome both make payment and checkout different strategies

*/