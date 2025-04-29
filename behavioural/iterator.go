package behavioural  

type Iterator interface{
	HasNext() bool
	Next() any
}

type SeriesIterator struct{
index int
arr []any
}

func(s *SeriesIterator) HasNext() bool {
	return s.index < len(s.arr)
}

func(s *SeriesIterator)Next() any{
	if !s.HasNext(){
		return nil
	}
	item:= s.arr[s.index]

	s.index++
	return item
}

func NewSeries(array []any) *SeriesIterator{
	return & SeriesIterator{arr: array}
}

/*
access elements in a collection without knowing its internal structure
*/