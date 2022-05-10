
DESCRIPTION

- add​(E e)	Ensures that this collection contains the specified element (optional operation).
- addAll​(Collection<? extends E> c): Adds all the elements in the specified collection to this collection (optional operation).
- clear(): Removes all the elements from this collection (optional operation).

contains​(Object o)	Returns true if this collection contains the specified element.
containsAll​(Collection<?> c)	Returns true if this collection contains all the elements in the specified collection.
equals​(Object o)	Compares the specified object with this collection for equality.
hashCode()	Returns the hash code value for this collection.
isEmpty()	Returns true if this collection contains no elements.
iterator()	Returns an iterator over the elements in this collection.
parallelStream()	Returns a possibly parallel Stream with this collection as its source.
remove​(Object o)	Removes a single instance of the specified element from this collection, if it is present (optional operation).
removeAll​(Collection<?> c)	Removes all of this collection’s elements that are also contained in the specified collection (optional operation).
removeIf​(Predicate<? super E> filter)	Removes all the elements of this collection that satisfy the given predicate.
retainAll​(Collection<?> c)	Retains only the elements in this collection that are contained in the specified collection (optional operation).
size()	Returns the number of elements in this collection.
spliterator()	Creates a Spliterator over the elements in this collection.
stream()	Returns a sequential Stream with this collection as its source.
toArray()	Returns an array containing all the elements in this collection.
toArray​(IntFunction<T[]> generator)	Returns an array containing all the elements in this collection, using the provided generator function to allocate the returned array.
toArray​(T[] a)	Returns an array containing all the elements in this collection; the runtime type of the returned array is that of the specified array.