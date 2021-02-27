package java_features.algorithms.realizations;

public interface Searchable {
	<T extends Comparable<T>> int ownFind(T[] array, T key);

	<T extends Comparable<T>> int find(T[] array, T key);
}
