package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void sortsByOrderAndAppendsRestAscending() {
    int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr2 = {2, 1, 4, 3, 9, 6};

    assertThat(solution.relativeSortArray(arr1, arr2))
        .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
  }

  @Test
  void appendsMissingNumbersInAscendingOrder() {
    int[] arr1 = {28, 6, 22, 8, 44, 17};
    int[] arr2 = {22, 28, 8, 6};

    assertThat(solution.relativeSortArray(arr1, arr2)).containsExactly(22, 28, 8, 6, 17, 44);
  }

  @Test
  void handlesSingleElement() {
    assertThat(solution.relativeSortArray(new int[] {0}, new int[] {0})).containsExactly(0);
  }

  @Test
  void handlesMinimalAndMaximalValues() {
    assertThat(solution.relativeSortArray(new int[] {0, 1000}, new int[] {1000}))
        .containsExactly(1000, 0);
  }
}
