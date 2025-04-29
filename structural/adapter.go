package structural
import ("fmt")

type PaymentGateWay interface {
	ProcessPayment(amount float64)string
}


type OldBank struct{}

func (b *OldBank) ExecuteTransaction(amount float64) string {
	// Legacy system requires a different way to process payments
	return fmt.Sprintf("Transaction of %f processed by the old bank system.", amount)
}

type PaymentAdapter struct{
	OldBankObj *OldBank
}

func(p *PaymentAdapter) ProcessPayment(amount float64)string{
	return p.OldBankObj.ExecuteTransaction(amount)
} 


/*
used to enable interaction between two otherwise incompatible systems or objects without altering/changing their code it acts as a bridge, 
like a real world adapter lets you connect your macbook charger to a wall socket while your charger and the wall socket are incompatible the adapter makes the connection possible
*/