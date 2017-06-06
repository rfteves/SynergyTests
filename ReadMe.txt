1. Explain why recursive implementation of QuickSort will require O(log n) of additional space
 
The QuickSort algorithm recursively divides an array into two smaller sub-arrays until there is no more sublist to split, that is the sublist size is 1. Therefore, the running time is equal to the number of times that you can halve n inputs before the sublist size gets to 1.
 
Inversely, this number, x, is the same as the number of times you can double 1 before reaching n, and it can be expressed as 2^x = n.
 
For example, log base(2) 8 = 3 because 2^3 = 8, so the running time of the operation is O(log2(n)). Given that logarithms with different bases differ only by a constant factor, we can omit the base 2 and just call this O(log(n)).
 
2. Explain the design pattern used in Java and .NET io stream/reader APIs.
 
IO stream is use to read or write stream of bytes while Reader is to read chars, strings and sometimes int.
 
I think the IO Stream/Reader classes extensively use the Decorator pattern to add functionalities to new implementations without affecting the original. This is accomplished by creating an object wrapper referred to as a Decorator around the actual object.
 
Examples:
 
new BufferedInputStream(InputStream in)
new DataInputStream(InputStream in)
new BufferedOutputStream(OutputStream out)
new ZipOutputStream(OutputStream out)

The IO Reader classes use the Adapter pattern which defines new implementations by reusing the original class and its methods. In particular, they change input/output stream interfaces to the required reader/writer interfaces.
 
Reader examples:
 
new InputStreamReader(InputStream in, Charset cs)
new BufferedReader(Reader in)
new FileReader(File or String)
new StringReader(String)
 
3. Test: Create an Iterator filtering framework: (1) IObjectTest interface with a single boolean test(Object o) method and (2) an implementation of Iterator (let’s call it FilteringIterator) which is initialized with another Iterator and an IObjectTest instance: new FilteringIterator(myIterator, myTest). Your FilteringIterator will then allow iteration over ‘myIterator’, but skipping any objects which don’t pass the ‘myTest’ test. Create a simple unit test for this framework.
 
 
 
 
 
