package hw.jdbc;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldNameConstants;

@Value
@Builder
@FieldNameConstants
class Student {

  long id;
  String name;
  long groupId;
}
