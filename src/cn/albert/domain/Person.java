package cn.albert.domain;

import lombok.*;
import sun.org.mozilla.javascript.internal.annotations.JSGetter;

import java.util.Objects;

/**
 * @author albert.cui
 * @date 2018/9/30 23:02
 */
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private Character sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
    }
    public void Shit() {
        System.out.println(this.getName()+",乖！叫爸爸---");
    }
}
