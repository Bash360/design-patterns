package creational
type Phone struct{
	Brand string
	Colour string 
}

type PhoneBuilder interface{
	SetBrand(brand string)PhoneBuilder
	SetColour(colour string)PhoneBuilder
	Build()Phone
}


type ConcretePhoneBuilder struct{
	phone *Phone
}

func NewConcretePhoneBuilder()*ConcretePhoneBuilder{
	return &ConcretePhoneBuilder{phone: &Phone{}}
}

func(nc *ConcretePhoneBuilder)SetBrand(brand string)PhoneBuilder{
	nc.phone.Brand=brand
	return nc
}

func(nc *ConcretePhoneBuilder)SetColour(colour string) PhoneBuilder{
	nc.phone.Colour=colour

	return nc
}

func(nc *ConcretePhoneBuilder)Build() Phone {
	return *nc.phone
}



