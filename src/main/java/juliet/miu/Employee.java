package juliet.miu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
    private String firstname;
    private String lastname;
    private Double salary;
    private LocalDate hireDate;

    @Override
    public  boolean equals(Object o){
        if(this == o)
            return true;
        if(o.getClass() != this.getClass())
            return false;
        Employee employee = (Employee) o;
        return this.getFirstname().equals(employee.getFirstname());
    }
}
