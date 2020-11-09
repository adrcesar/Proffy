import React, {InputHTMLAttributes} from 'react'

import './styles.css';

//PEGO TODAS AS PROPRIEDADES DO ELEMENTO INPUT DO HTML
interface InputProps extends InputHTMLAttributes<HTMLInputElement> {
    name: string;
    label: string;
}
//quando uso interface transformo function Input em const Input
                                    //poderia ser props as variaveis abaixo
                                    //...rest todas as propriedades do input
                                    // exceto label e name
const Input: React.FC<InputProps> = ({label, name, ...rest }) => {
    return (
        <div className="input-block">
            <label htmlFor={name}>{label}</label>
            <input type="text" id={name} {...rest}/> {/* rest pega todas prop do input*/ }
        </div>

    );
}

export default Input;