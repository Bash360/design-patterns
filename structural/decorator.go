package structural

type Coffee interface{
	Cost()float64
}

type PlainCoffee struct{}

func(p *PlainCoffee) Cost()float64{
	return 2_000
}


type SugarDecorator struct{

	CoffeeObj Coffee

}

func(p *SugarDecorator) Cost()float64{
	return p.CoffeeObj.Cost() + 500
}


type MilkDecorator struct{
	CoffeeObj Coffee
}

func(m *MilkDecorator) Cost()float64{
	return m.CoffeeObj.Cost()+1000
}
/*
an object that wraps another object 
to add a new behaviour without altering the original objects code, it implements the open and closed principle
used heavily in nestjs, awilix and angular 
like making a class a controller without altering its structure, adding milk and sugar to a coffee class without altering coffee object lol
*/