import React, { SelectHTMLAttributes } from 'react'

import './styles.css';

//PEGO TODAS AS PROPRIEDADES DO ELEMENTO Select DO HTML
interface SelectProps extends SelectHTMLAttributes<HTMLSelectElement> {
    name: string;
    label: string;
    options: Array<{       //array de objetos
        value: string;
        label: string;
    }>
}
//quando uso interface transformo function Select em const Select
//poderia ser props as variaveis abaixo
//...rest todas as propriedades do Select
// exceto label e name
const Select: React.FC<SelectProps> = ({ label, name, options, ...rest }) => {
    return (
        <div className="select-block">
            <label htmlFor={name}>{label}</label>
            <select value="" id={name} {...rest}>
                <option value="" disabled hidden>Selecione uma opção</option>
                {options.map(option => {  //repeticao react
                    return <option key={option.value} value={option.value}>{option.label}</option>
                })}
            </select> {/* rest pega todas prop do Select*/}
        </div>

    );
}

export default Select;