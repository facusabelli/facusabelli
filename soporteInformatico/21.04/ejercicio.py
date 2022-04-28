import pandas as pd
import os 
print("anda? si! \n")
path = os.path.dirname(os.path.realpath(__file__))


df = pd.read_csv(path + "/listadoDePersonal.csv",sep=";",engine="python",encoding="latin-1")
df.set_index("Id") #indice
df1 = df.drop_duplicates() #elimino duplicadas
df1.to_csv(path + "/archivoSinDuplicados.csv",index=False) #creo archivos sin duplicados

df2 = pd.concat([df[:300],df[-200:]])
df2.to_csv(path + "/mezclados.csv",index=False) #creo archivo de mezclados
print(df2)

df3 = df.loc[[1,5,12,36]]
df3.to_csv(path + "/especificos.csv",index=False) #creo archivo de especificos

print(list(df.columns)) #lista con todas las columnas

print(df["Puesto"].values) #solo columna de puesto
