package app.spring.kafkaspring.Payload;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
}
