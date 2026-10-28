package edu.luc.kmurphy37.comp271.sorting;

public class SelectionSorter implements IntegerSorter {
  @Override
  public void sortAscending(int[] integersToSort) {

    for (int i = 0; i < integersToSort.length; i++) {

      int indexOfSmallestElementInUnsorted = i;
      int smallestElementInUnsorted = integersToSort[i];

      for (int j = i; j < integersToSort.length; j++) {
        if (integersToSort[j] < smallestElementInUnsorted) {
          indexOfSmallestElementInUnsorted = j;
          smallestElementInUnsorted = integersToSort[indexOfSmallestElementInUnsorted];
        }
      }

      // swap(integersToSort[i], integersToSort[indexOfSmallestElementInUnsorted])
      int temp = integersToSort[i];
      integersToSort[i] = integersToSort[indexOfSmallestElementInUnsorted];
      integersToSort[indexOfSmallestElementInUnsorted] = temp;

    }
  }
}
