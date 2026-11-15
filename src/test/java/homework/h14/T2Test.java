package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 queue = new T2();

  @Test
  void behavesAsQueueInExample() {
    queue.push(1);
    queue.push(2);

    assertThat(queue.peek()).isEqualTo(1);
    assertThat(queue.pop()).isEqualTo(1);
    assertThat(queue.empty()).isFalse();
  }

  @Test
  void isEmptyWhenCreated() {
    assertThat(queue.empty()).isTrue();
  }

  @Test
  void isNotEmptyAfterPush() {
    queue.push(5);

    assertThat(queue.empty()).isFalse();
  }

  @Test
  void becomesEmptyAfterPoppingSingleElement() {
    queue.push(9);

    assertThat(queue.pop()).isEqualTo(9);
    assertThat(queue.empty()).isTrue();
  }

  @Test
  void keepsOrderWhenPushingBetweenPops() {
    queue.push(1);
    queue.push(2);
    assertThat(queue.pop()).isEqualTo(1);

    queue.push(3);

    assertThat(queue.pop()).isEqualTo(2);
    assertThat(queue.peek()).isEqualTo(3);
    assertThat(queue.pop()).isEqualTo(3);
  }

  @Test
  void handlesMaximalNumberOfCalls() {
    for (int i = 0; i < 50; i++) {
      queue.push(i % 9 + 1);
    }

    for (int i = 0; i < 50; i++) {
      assertThat(queue.pop()).isEqualTo(i % 9 + 1);
    }
  }
}
