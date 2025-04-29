package behavioural

type Iterator interface {
	HasNext() bool
	Next() any
}

type ArrayIterator struct {
	index int
	arr   []any
}

func (s *ArrayIterator) HasNext() bool {
	return s.index < len(s.arr)
}

func (s *ArrayIterator) Next() any {
	if !s.HasNext() {
		return nil
	}
	item := s.arr[s.index]

	s.index++
	return item
}

type MapIterator struct {
	keys  []any
	index int
	maps  map[any]any
}

func (m *MapIterator) HasNext() bool {
	return m.index < len(m.keys)
}

func (m *MapIterator) Next() any {

	if !m.HasNext() {
		return nil
	}

	key := m.keys[m.index]
	value := m.maps[key]
	m.index += 1
	return value

}
func NewIterator(collection any) Iterator {
	
	switch c:=collection.(type) {
	case []any:
		return &ArrayIterator{arr: c}
	case map[any]any:

		mapKeys := make([]any, 0)
		for key := range c{
			mapKeys = append(mapKeys, key)
		}

		return &MapIterator{keys: mapKeys, maps: c}
	default:
		return nil

	}
}

/*
access elements in a collection without knowing its internal structure
*/
