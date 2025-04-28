package creational

import (
	"fmt"
	"math/rand"
)

type VirtualEnv struct{
	Memory int
	Stack int
	Heap int
	CPU string 
	EnvID string;
}


func (v *VirtualEnv) Clone() *VirtualEnv{
	cloneId:=fmt.Sprintf("clone-%s", string(rune(rand.Int()*100_000)))
 	newVirtualEnv:= &VirtualEnv{Heap:v.Heap,Stack:v.Stack,Memory: v.Memory,CPU:v.CPU,EnvID:cloneId }
	return newVirtualEnv

}


/*
Used to create objects that have a base and an expensive creation so we reuse an already instantiated object to create 
it which is like the prototype and the new object is a clone of it




*/