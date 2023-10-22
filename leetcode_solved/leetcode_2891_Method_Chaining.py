# AC: Runtime 552 ms Beats 34.45%
# Memory 59.9 MB Beats 86.19%

import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    return animals[animals['weight'] > 100].sort_values(['weight'], ascending=False,)[['name']]