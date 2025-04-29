package creational


type Car struct {
	Engine string
	Wheels int
	Seats  int
	Colour string
}

type CarBuilder interface {
	SetEngine(engine string) CarBuilder
	SetWheels(wheels int) CarBuilder
	SetSeats(seats int) CarBuilder
	SetColour(colour string) CarBuilder
	Build() *Car
}

type ConcreteCarBuilder struct {
	car *Car
}

// Build implements CarBuilder.
func (b *ConcreteCarBuilder) Build() *Car {
	return b.car
}

// SetColour implements CarBuilder.
func (b *ConcreteCarBuilder) SetColour(colour string) CarBuilder {
	b.car.Colour=colour
	return b
}

// SetSeats implements CarBuilder.
func (b *ConcreteCarBuilder) SetSeats(seats int) CarBuilder {
	b.car.Seats=seats
	return b
}

// SetWheels implements CarBuilder.
func (b *ConcreteCarBuilder) SetWheels(wheels int) CarBuilder {
	b.car.Wheels=wheels
	return b
}

func NewConcreteCarBuilder() *ConcreteCarBuilder {
	return &ConcreteCarBuilder{car: &Car{}}
}

func (b *ConcreteCarBuilder) SetEngine(engine string) CarBuilder {
	b.car.Engine = engine

	return b
}

/*
used to create complex object
decoupling the building of an object from the finished object
parts: Product what we are trying to build, Builder, concrete builder implements the builder,Client the one that needs the product
lets you build different objects without changing the build process

*/
