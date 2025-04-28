package structural

import "fmt"

type BankServerI interface{
	Withdraw(accountID string, amount float64) bool
}

type BankServer struct{

}

func (b *BankServer) Withdraw(accountID string, amount float64) bool{
	fmt.Println("Processing withdrawal on bank server ......", amount, accountID)
	return true
}

type CreditCardProxy struct{
	bank *BankServer
}

func CreditCard() *CreditCardProxy{
	return &CreditCardProxy{
		bank: &BankServer{},
	}
}

func(a *CreditCardProxy)  Withdraw(accountID string, amount float64) bool{
	if amount > 10_000{
		fmt.Println("Daily limit exceeded")
		return false
	}

	return a.bank.Withdraw(accountID , amount )
}
/*
proxy an object that acts of behalf of another to protect, control access  or encapsulate it like a reverse or forward proxy acts as an intermediary between a client and a server
any interaction happens through the proxy not directly

*/