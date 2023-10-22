# Runtime Details 425ms Beats 67.78%of users with Pandas
# Memory Details 59.96MB Beats 35.36%of users with Pandas
# 
import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    column = ['student_id', 'age']
    result = pd.DataFrame(student_data, columns = column)

    return result