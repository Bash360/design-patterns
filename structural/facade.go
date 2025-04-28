package structural

import "fmt"
type OrderFacade struct {
	stockService   *StockService
	paymentService *PaymentService
	invoiceService *InvoiceService
}

func NewOrderFacade() *OrderFacade {
	return &OrderFacade{
		stockService:   &StockService{},
		paymentService: &PaymentService{},
		invoiceService: &InvoiceService{},
	}
}

func (o *OrderFacade) PlaceOrder(productID string, amount float64) {
	if !o.stockService.CheckStock(productID) {
		fmt.Println("Product out of stock!")
		return
	}

	o.paymentService.MakePayment(amount)
	o.stockService.UpdateStock(productID)
	o.invoiceService.SendInvoice(productID, amount)
	fmt.Println("Order placed successfully!")
}


type StockService struct{}
func (s *StockService) CheckStock(productID string) bool {
	fmt.Println("Checking stock for", productID)
	return true
}
func (s *StockService) UpdateStock(productID string) {
	fmt.Println("Updating stock for", productID)
}

type PaymentService struct{}
func (p *PaymentService) MakePayment(amount float64) {
	fmt.Println("Processing payment of", amount)
}

type InvoiceService struct{}
func (i *InvoiceService) SendInvoice(productID string, amount float64) {
	fmt.Println("Sending invoice for", productID, "Amount:", amount)
}

/*
A facade gives you a simple way to interact with a complicated system
*/